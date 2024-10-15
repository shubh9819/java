package Collection;

public class Car {
    String name;
    int avg_pr_miles;
    int price;

    public Car(String name,int avg_pr_miles,int price){
        this.name=name;
        this.avg_pr_miles=avg_pr_miles;
        this.price=price;
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }

    public int getAvg_pr_miles() {
        return avg_pr_miles;
    }

    public void setAvg_pr_miles(int avg_pr_miles) {
        this.avg_pr_miles = avg_pr_miles;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", avg_pr_miles=" + avg_pr_miles +
                ", price=" + price +
                '}';
    }
}
