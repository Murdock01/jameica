/**********************************************************************
 *
 * Copyright (c) 2004 Olaf Willuhn
 * All rights reserved.
 * 
 * This software is copyrighted work licensed under the terms of the
 * Jameica License.  Please consult the file "LICENSE" for details. 
 *
 **********************************************************************/

package de.willuhn.jameica.gui.internal.buttons;

import de.willuhn.jameica.gui.parts.Button;
import de.willuhn.jameica.system.Application;

/**
 * Vorkonfigurierter Zurueck-Button.
 */
public class Back extends Button
{
  /**
   * ct.
   * Der Button ist als Default-Button markiert.
   */
  public Back()
  {
    this(true);
  }

  /**
   * ct.
   * @param isDefault true, wenn es der Default-Button sein soll.
   */
  public Back(boolean isDefault)
  {
    super(Application.getI18n().tr("Zur�ck"),new de.willuhn.jameica.gui.internal.action.Back(),null,isDefault,"go-previous.png");
  }
}
