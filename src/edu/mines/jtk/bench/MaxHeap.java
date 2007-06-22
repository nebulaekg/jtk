/****************************************************************************
Copyright (c) 2007, Colorado School of Mines and others. All rights reserved.
This program and accompanying materials are made available under the terms of
the Common Public License - v1.0, which accompanies this distribution, and is 
available at http://www.eclipse.org/legal/cpl-v10.html
****************************************************************************/
package edu.mines.jtk.bench;

/**
 * Tests allocation from Java heap.
 * @author Dave Hale, Colorado School of Mines
 * @version 2007.06.22
 */
public class MaxHeap {

  public static void main(String[] args) {
    int m = 1024;
    for (int n=1024; n<2000000000; n=(int)(1.1*n)) {
      float[][] a = new float[n][1024];
      System.out.println("allocated n="+n+" kiB");
    }
  }
}
