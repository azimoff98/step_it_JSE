package az.stepit.desingPatterns.builder;

public class Subscription {
    private long id;
    private String name;
    private String surname;
    private String subscriptionNumber;
    private double balance;
    private String subscriptionType;

    public static class Builder{
        private long id;
        private String name;
        private String surname;
        private String subscriptionNumber;
        private double balance;
        private String subscriptionType;

        public Builder(){

        }
        public Builder withId(long id){
            this.id = id;
            return this;
        }
        public Builder withName(String name){
            this.name = name;
            return this;
        }
        public Builder withSurname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder withSubscriptionNumber(String subscriptionNumber){
            this.subscriptionNumber = subscriptionNumber;
            return this;
        }
        public Builder withBalance(double balance){
            this.balance = balance;
            return this;
        }
        public Builder withSubscriptionType(String subscriptionType){
            this.subscriptionType = subscriptionType;
            return this;
        }

        public Subscription build(){
            Subscription subscription = new Subscription();

            subscription.setId(this.id);
            subscription.setName(this.name);
            subscription.setSurname(this.surname);
            subscription.setSubscriptionNumber(this.subscriptionNumber);
            subscription.setBalance(this.balance);
            subscription.setSubscriptionType(this.subscriptionType);

            return subscription;
        }
    }

    private Subscription(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubscriptionNumber() {
        return subscriptionNumber;
    }

    public void setSubscriptionNumber(String subscriptionNumber) {
        this.subscriptionNumber = subscriptionNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
}
