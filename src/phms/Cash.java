/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phms;

/**
 *
 * @author $ubha
 */
public class Cash {
    private final int id;
    private final String name;
    private final String mno;
    private final String address;
    private final String email;
    private final String password;
    
    public Cash(int id,String name,String mno,String address,String email, String password)
    {
        this.id=id;
        this.name=name;
        this.mno=mno;
        this.address=address;
        this.email=email;
        this.password=password;
        
    }
            
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getmno()
    {
        return mno;
    }
    public String getaddress()
    {
        return address;
    }
    public String getemail()
    {
        return email;
    }
    public String getpassword()
    {
        return password;
    }
}
