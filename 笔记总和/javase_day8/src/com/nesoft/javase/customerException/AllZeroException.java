package com.nesoft.javase.customerException;
// 自定义异常一定要继承AllZeroException
public class AllZeroException extends Exception{
	 public AllZeroException() {
	        super();
	    }

	    /**
	     * Constructs a new AllZeroException with the specified detail message.  The
	     * cause is not initialized, and may subsequently be initialized by
	     * a call to {@link #initCause}.
	     *
	     * @param   message   the detail message. The detail message is saved for
	     *          later retrieval by the {@link #getMessage()} method.
	     */
	    public AllZeroException(String message) {
	        super(message);
	    }

	    /**
	     * Constructs a new AllZeroException with the specified detail message and
	     * cause.  <p>Note that the detail message associated with
	     * {@code cause} is <i>not</i> automatically incorporated in
	     * this AllZeroException's detail message.
	     *
	     * @param  message the detail message (which is saved for later retrieval
	     *         by the {@link #getMessage()} method).
	     * @param  cause the cause (which is saved for later retrieval by the
	     *         {@link #getCause()} method).  (A <tt>null</tt> value is
	     *         permitted, and indicates that the cause is nonexistent or
	     *         unknown.)
	     * @since  1.4
	     */
	    public AllZeroException(String message, Throwable cause) {
	        super(message, cause);
	    }

	    /**
	     * Constructs a new AllZeroException with the specified cause and a detail
	     * message of <tt>(cause==null ? null : cause.toString())</tt> (which
	     * typically contains the class and detail message of <tt>cause</tt>).
	     * This constructor is useful for AllZeroExceptions that are little more than
	     * wrappers for other throwables (for example, {@link
	     * java.security.PrivilegedActionAllZeroException}).
	     *
	     * @param  cause the cause (which is saved for later retrieval by the
	     *         {@link #getCause()} method).  (A <tt>null</tt> value is
	     *         permitted, and indicates that the cause is nonexistent or
	     *         unknown.)
	     * @since  1.4
	     */
	    public AllZeroException(Throwable cause) {
	        super(cause);
	    }

	    /**
	     * Constructs a new AllZeroException with the specified detail message,
	     * cause, suppression enabled or disabled, and writable stack
	     * trace enabled or disabled.
	     *
	     * @param  message the detail message.
	     * @param cause the cause.  (A {@code null} value is permitted,
	     * and indicates that the cause is nonexistent or unknown.)
	     * @param enableSuppression whether or not suppression is enabled
	     *                          or disabled
	     * @param writableStackTrace whether or not the stack trace should
	     *                           be writable
	     * @since 1.7
	     */
	    protected AllZeroException(String message, Throwable cause,
	                        boolean enableSuppression,
	                        boolean writableStackTrace) {
	        super(message, cause, enableSuppression, writableStackTrace);
	    }
}
