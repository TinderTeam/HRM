package cn.fuego.util.format.date;

public class DateFomatException extends RuntimeException
{
	
	/*
	 * Constant
	 */
	public static final String DATE_FOMATE = "date fomate err!";

	public DateFomatException()
	{
		super();
	}

	public DateFomatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		// super(message, cause, enableSuppression, writableStackTrace);
	}

	public DateFomatException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public DateFomatException(String message)
	{
		super(message);
	}

	public DateFomatException(Throwable cause)
	{
		super(cause);
	}

	@Override
	public String toString()
	{
		String message = getLocalizedMessage();
		return (message != null) ? (message) : "";

	}
}
