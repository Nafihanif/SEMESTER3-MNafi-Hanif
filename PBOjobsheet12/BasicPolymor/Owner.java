package BasicPolymor;

public class Owner {
    public void pay(PayAble p){
        System.out.println("Total payment = " + p.getPaymentAmount());
        if(p instanceof ElectricityBill){
            System.out.println(""+ ((ElectricityBill)p).getBillInfo());
        } else if (p instanceof PermanentEmployee){
            PermanentEmployee pe = (PermanentEmployee)p;
            pe.getEmployeeInfo();
            System.out.println(""+ pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee e){
        System.out.println(""+ e.getEmployeeInfo());
        if (e instanceof PermanentEmployee)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
