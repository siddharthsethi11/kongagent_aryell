package Ts01.util;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class date

{
	// ---( internal utility methods )---

	final static date _instance = new date();

	static date _newInstance() { return new date(); }

	static date _cast(Object o) { return (date)o; }

	// ---( server methods )---




	public static final void currentTimeMillis (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(currentTimeMillis)>> ---
		// @sigtype java 3.5
		// [o] object:0:required currentTimeMillis
		IDataCursor c = pipeline.getCursor();
		long l = System.currentTimeMillis();
		IDataUtil.put(c, "currentTimeMillis", l);
		c.destroy();
		// --- <<IS-END>> ---

                
	}
}

