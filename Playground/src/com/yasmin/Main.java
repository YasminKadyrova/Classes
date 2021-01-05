import com.yasmin.*;

    public class Main {
        public static void main(String[] args) {
            Account acc1=new Account("1","First Account");
            System.out.println(acc1.getId());
            System.out.println(acc1.getName());
            System.out.println(acc1.getBalance());


            Account acc2=new Account("2","Second Account",5000);
            System.out.println(acc2.credit(300));
            System.out.println(acc2.debit(200));
            System.out.println(acc2.toString());

            Account acc3=new Account("3","Third Account",3000);
            System.out.println(acc3.debit(3001));

            Account acc4=new Account("4","Fourth Account");
            acc1.transferTo(acc4,200);


            Ball ball1=new Ball(0,0,1,2,3);
            System.out.println(ball1.getX());
            System.out.println(ball1.getY());
            System.out.println(ball1.getRadius());
            System.out.println(ball1.getxDelta());
            System.out.println(ball1.getyDelta());

            Ball ball2=new Ball(1,1,5,4,3);
            ball2.setX(0);
            ball2.setY(3);
            ball2.setRadius(3);
            ball2.setxDelta(3);
            ball2.setyDelta(1);
            System.out.println(ball2);

            Ball ball3=new Ball(1,1,5,4,3);
            ball3.reflectHorizontal();
            System.out.println(ball3.getxDelta());

            ball3.reflectVertical();
            System.out.println(ball3.getyDelta());


            Circle c1=new Circle();
            System.out.println("The circle has a radius of "+ c1.getRadius() + "and the area of "+ c1.getArea());

            Circle c2=new Circle(2.0);
            System.out.println("The circle has a radius of "+ c2.getRadius()+ "and the area of "+ c2.getArea());

            System.out.println(c1.getColor());
            System.out.println(c2.getColor());

            Circle c4=new Circle();
            c4.setRadius(5.5);
            System.out.println("radius is "+ c4.getRadius());
            System.out.println("circumference is "+ c4.getCircumference());

            c4.setColor("green");
            System.out.println("the color is "+ c4.getColor());

            Circle c5=new Circle();
            System.out.println(c5.toString());
            System.out.println(c5);

            Date date1 = new Date(30, 5, 1999);
            System.out.println(date1.getDay());
            System.out.println(date1.getMonth());
            System.out.println(date1.getYear());

            Date date2=new Date(5,10,1998);
            date2.setYear(1999);
            System.out.println(date2);
            date2.setMonth(5);
            System.out.println(date2);
            date2.setDay(3);
            System.out.println(date2);

            Date date3=new Date(2,3,1990);
            date3.setDate(1,4,1991);
            System.out.println(date3);



            Employee emp1 = new Employee(1, "Ivan", "Ivanov", 1000);
            System.out.println(emp1.getId());
            System.out.println(emp1.getFirstName());
            System.out.println(emp1.getLastName());
            System.out.println(emp1.getSalary());

            Employee emp2 = new Employee(2, "Maria", "Antonova", 2000);
            emp2.setSalary(3000);
            System.out.println(emp2.getSalary());
            System.out.println(emp2.raiseSalary(30));
            System.out.println(emp2.getAnnualSalary());

            Employee emp3 = new Employee(3, "Anna", "Morozova", 1234);
            System.out.println(emp3.getName());
            System.out.println(emp3.toString());


            InvoiceItem item1=new InvoiceItem("1","Milk",2,500);
            System.out.println(item1.getId());
            System.out.println(item1.getDesc());
            System.out.println(item1.getQty());
            System.out.println(item1.getUnitPrice());

            InvoiceItem item2=new InvoiceItem("2","Tea",6,550);
            item2.setQty(7);
            System.out.println(item2.getQty());
            item2.setUnitPrice(600);
            System.out.println(item2.getUnitPrice());
            System.out.println(item2.getTotal());



            Rectangle rect1=new Rectangle();
            System.out.println("the length is "+ rect1.getLength() + " the width is "+ rect1.getWidth());

            Rectangle rect2=new Rectangle(2.0f,3.0f);
            System.out.println("the length is "+ rect2.getLength() + " the width is "+ rect2.getWidth());

            Rectangle rect3=new Rectangle();
            rect3.setLength(4.0f);
            rect3.setWidth(5.5f);
            System.out.println(rect3.getArea());
            System.out.println(rect3.getPerimeter());

            System.out.println(rect3.toString());





            TimeClass currentTime=new TimeClass(23,40,20);
            System.out.println(currentTime.getHour() + "hours");
            System.out.println(currentTime.getMinute() + "minutes");
            System.out.println(currentTime.getSecond() +"seconds");

            TimeClass currentTime2=new TimeClass(12,34,12);
            currentTime2.setMinute(20);
            System.out.println(currentTime2.getMinute() + "minutes");
            currentTime2.setSecond(10);
            System.out.println(currentTime2.getSecond() + "seconds");
            currentTime2.setHour(10);
            System.out.println(currentTime2.getHour() + "hours");

            TimeClass currentTime3=new TimeClass(10,10,10);
            currentTime3.setTime(11,11,11);
            System.out.println(currentTime3);

            TimeClass currentTime4=new TimeClass(9,20,5);
            currentTime4.nextSecond();
            System.out.println(currentTime4);
            currentTime4.previousSecond();
            System.out.println(currentTime4);


        }

    }

