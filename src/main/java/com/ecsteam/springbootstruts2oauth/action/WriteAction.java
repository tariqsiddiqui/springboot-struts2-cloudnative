package com.ecsteam.springbootstruts2oauth.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


public class WriteAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	String message;

    @Override
	public String execute() throws Exception {
    	
    	HttpServletRequest req = ServletActionContext.getRequest();
    	req.getSession().setAttribute("Testing", "redis values");
		// TODO Auto-generated method stub
    	message = "HelloAction is called";
    	System.out.println("HellAction is called");
    	
    	System.out.println("Key stored in Redis session: " + req.getSession().getAttribute("Testing"));
    	//HttpServletResponse response = ServletActionContext.getResponse();
    	
    	this.addActionMessage("HelloAction Called!");
 		return SUCCESS;
	}


	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
	}


    public void setMessage(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }


}