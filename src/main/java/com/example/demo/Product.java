package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ResponseBody;

public class Product   
{  
private int id;  
private String pname;  
private String batchno;  
private double price;  
private int noofproduct;  
//default constructor  
public Product()  
{  
      
}  
//constructor using fields  
public Product(int id, String pname, String batchno, double price, int noofproduct)   
{  
super();  
this.id = id;  
this.pname = pname;  
this.batchno = batchno;  
this.price = price;  
this.noofproduct = noofproduct;  
}  
//getters and setters  
public int getId()   
{  
return id;  
}  
public void setId(int id)   
{  
this.id = id;  
}  
public String getPname()   
{  
return pname;  
}  
public void setPname(String pname)   
{  
this.pname = pname;  
}  
public String getBatchno()   
{  
return batchno;  
}  
public void setBatchno(String batchno)   
{  
this.batchno = batchno;  
}  
public double getPrice()   
{  
return price;  
}  
public void setPrice(double price)   
{  
this.price = price;  
}  
public int getNoofproduct()   
{  
return noofproduct;  
}  
public void setNoofproduct(int noofproduct)   
{  
this.noofproduct = noofproduct;  
}  
}  