import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRegistry {


    public static Map<String, OrderRecord> records = null;
    public static Integer totalAmount = 0;



    public class OrderRecord
    {
        public String user;
        public LocalDate date;
        public Integer amount;
    }

    public class RegistryException extends Exception {
        private static final long serialVersionUID = -4198443324894529516L;

        public RegistryException(String message) {
            super(message);
        }
    };

    public void init()
    {
        if(OrderRegistry.records == null)
        {
            OrderRegistry.records = new HashMap<String, OrderRecord>();
        }
    }

    /*
     *  Assume the List "orders" are ordered by user
     */
    public void registerOrders(List<OrderRecord> orders) throws RegistryException
    {
        OrderRecord temporaryRecord = new OrderRecord();
        temporaryRecord.user = null;

        for(OrderRecord order : orders)
        {
            if(order.user != temporaryRecord.user)
            {
                if(temporaryRecord.user != null)
                {
                    persistUserRecord(temporaryRecord);
                }

                System.out.println(temporaryRecord.user + " has created %" + (temporaryRecord.amount / totalAmount * 100) + " of all order amounts today so far.");

                temporaryRecord = new OrderRecord();
                temporaryRecord.user = order.user;
                temporaryRecord.date = LocalDate.now();

                OrderRecord userRecord = OrderRegistry.records.get(order.user);
                if(userRecord != null)
                {
                    temporaryRecord.amount = userRecord.amount;
                }
                else
                {
                    temporaryRecord.amount = 0;
                    OrderRegistry.records.put(order.user, temporaryRecord);
                }
            }

            temporaryRecord.amount += order.amount;
            OrderRegistry.totalAmount += order.amount;
        }

    }

    private void persistUserRecord(OrderRecord temporaryRecord) throws RegistryException {

        try {
            deleteExisting(temporaryRecord);
            persistCurrent(temporaryRecord);
        }
        catch (Exception e)
        {
            throw new RegistryException("Error in persistence");
        }

    }

    private void deleteExisting(OrderRecord temporaryRecord) {
        // Assume this works as intended but can produce Exceptions related to the persistence layer
    }

    private void persistCurrent(OrderRecord temporaryRecord) {
        // Assume this works as intended but can produce Exceptions related to the persistence layer
    }


}



