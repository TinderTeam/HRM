package cn.fuego.misp.domain.view;

import java.io.Serializable;

public class UserFunctionView  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userID;
	private String functionID;
	/**
	 * @return the userID
	 */
	public String getUserID()
	{
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID)
	{
		this.userID = userID;
	}
	/**
	 * @return the functionID
	 */
	public String getFunctionID()
	{
		return functionID;
	}
	/**
	 * @param functionID the functionID to set
	 */
	public void setFunctionID(String functionID)
	{
		this.functionID = functionID;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "UserFunctionView [userID=" + userID + ", functionID="
				+ functionID + "]";
	}
}
