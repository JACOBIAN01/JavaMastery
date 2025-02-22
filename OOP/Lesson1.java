
class Jacobian{
    String name;
    int id;

    public Jacobian(String name,int id){
        this.name = name;
        this.id = id;
    }

    public void GetDetails(){
        System.out.println("Name: "+name+" ID: "+id);
    }
}

class HR extends Jacobian{
    String dept;
    public HR(String name,int id,String dept){
        super(name, id);
        this.dept= dept;
    }
}

class Tech extends Jacobian{
    String tech;
    public Tech(String name,int id , String tech){
        super(name,id);
        this.tech = tech;
    }
}

class Lesson1{
    public static void main(String[] args) {
         Jacobian avi = new Jacobian("Avi", 1234);
        
    }
}