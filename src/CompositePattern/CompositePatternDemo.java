package CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        var CEO = new Employee("John","CEO", 30000);

        var headSales = new Employee("Robert","Head Sales", 20000);

        var headMarketing = new Employee("Michel","Head Marketing", 20000);

        var clerk1 = new Employee("Laura","Marketing", 10000);
        var clerk2 = new Employee("Bob","Marketing", 10000);

        var salesExecutive1 = new Employee("Richard","Sales", 10000);
        var salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);
        for (var headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
