package hotel;

public class cook extends employee{

    public  cook(){

    }

    public cook(String id,String name,int salary){
        super(id,name,salary);
    }
    @Override
    public void work(){
        System.out.println("cooking");
    }

}
