public class Employee
{

    /**
     * Instance variables
     */
    private int id;
    private String name;
    private boolean fulltime;
    private Project project;

    

/**
 * constructor
 */
    //Employee (int id,String name,boolean fulltime)
   // {
    //    this.id=id;
    //    this.name=name;
     //   this.fulltime=fulltime;
    //}

    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setFulltime(boolean fulltime)
    {
        this.fulltime=fulltime;
    }
    public void setProject(Project project)
        {
            this.project=project;
        }

    public int getId()
        {
            return this.id;
        }

    public String getName()
        {
            return this.name;

        }  
    public boolean isFulltime()
        {
            return this.fulltime;
        }  

    public Project getProject()
        {
            return this.project;
        }
}



