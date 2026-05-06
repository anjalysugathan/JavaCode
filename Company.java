public class Company
{
   public static void main(String []args)
   {
    //Employee employee1=new Employee (  111,  "Alex" ,  true);
    //Employee employee2=new Employee (  222 , "Samual" ,  false);

   Employee employee1=new Employee();
   Employee employee2=new Employee();
   Project project=new Project("E-commerce");

   employee1.setId( 111);
   employee1.setName( "Alex");
   employee1.setFulltime( true);
   employee1.setProject(project);
    
   employee2.setId( 222);
   employee2.setName( "Samual");
   employee2.setFulltime( false);
   employee2.setProject(project);  
     

    System.out.println(employee1.getId());
    System.out.println(employee1.getName());
    System.out.println(employee1.isFulltime());
    System.out.println(employee1.getProject().getName());
    
    System.out.println(employee2.getId());
    System.out.println(employee2.getName());
    System.out.println(employee2.isFulltime());
    System.out.println(employee2.getProject().getName());
    
   
   }
}