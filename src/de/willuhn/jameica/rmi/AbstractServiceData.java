/**********************************************************************
 * $Source: /cvsroot/jameica/jameica/src/de/willuhn/jameica/rmi/Attic/AbstractServiceData.java,v $
 * $Revision: 1.3 $
 * $Date: 2004/01/03 18:08:06 $
 * $Author: willuhn $
 * $Locker:  $
 * $State: Exp $
 **********************************************************************/
package de.willuhn.jameica.rmi;

import net.n3.nanoxml.IXMLElement;
import de.willuhn.jameica.Application;

public abstract class AbstractServiceData implements ServiceData {

	private String name;
	private String type;
  private String className;

  AbstractServiceData(IXMLElement xml)
	{
		name      = xml.getAttribute("name",null);
		type      = xml.getAttribute("type",null);
    className = xml.getAttribute("class",null);
    if (className == null || name == null || type == null)
    {
      Application.getLog().error("cannot init service data");
      Application.getLog().error(" one of the needed params was null");
      Application.getLog().error(" name       : " + name);
      Application.getLog().error(" type       : " + type);
      Application.getLog().error(" class      : " + className);
    }
	}

  public String getClassName()
  {
    return className;
  }

  public String getType()
	{
		return type;
	}

  public String getName()
  {
    return name;
  }
}


/*********************************************************************
 * $Log: AbstractServiceData.java,v $
 * Revision 1.3  2004/01/03 18:08:06  willuhn
 * @N Exception logging
 * @C replaced bb.util xml parser with nanoxml
 *
 * Revision 1.2  2003/11/12 00:58:54  willuhn
 * *** empty log message ***
 *
 * Revision 1.1  2003/10/29 00:41:27  willuhn
 * *** empty log message ***
 *
 **********************************************************************/