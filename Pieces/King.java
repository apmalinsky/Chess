/*
Author: Andy Malinsky

*/

import java.util.*;
import java.awt.*;




public class King
{
   private ChessGUI2 g; 
   private int p;
   private String movePString;
   
   public King(int position, String movePStrin, ChessGUI2 gee) 
   {
      p = position;
      this.movePString = movePStrin;
      g = gee;
      
      highlightMovesK();
   }
   
   
   public void highlightMovesK()
   { 


      int caseCounterK = 0;

      if(g.orientation == 'w')
      {
         if(g.whiteTurn)
         {
            while(caseCounterK < 10)
                  {
                     if(caseCounterK == 0)
                     {
                        if(p == 60)
                        {
                           for(int c = 0; c < movePString.length(); c++)
                           {
                              char h = movePString.charAt(c);
                           
                              if(h == 'F' && g.pieces[p+1] == " " && g.pieces[p+2] == " " && g.pieces[p+3].equals("WR.gifF"))
                              {
                                 int posPosition = p + 2;
                                 g.possibleMoves.add(posPosition);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPosition]);
                                 System.out.println(g.pieces[p+3]);
                              }
                              if(h == 'F' && g.pieces[p-1] == " " && g.pieces[p-2] == " " && g.pieces[p-3] == " " && g.pieces[p-4].equals("WR.gifF"))
                              {
                                 int posPosition = p - 2;
                                 g.possibleMoves.add(posPosition);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPosition]);
                              }
                           }
                        }
                        caseCounterK++;
                     }
                     if(caseCounterK == 1)
                     {
                        if((p >= 9 && p <= 14) || (p >= 17 && p <= 22) || (p >= 25 && p <= 30) ||
                           (p >= 33 && p <= 38) || (p >= 41 && p <= 46) || (p >= 49 && p <= 54))
                        {
                           int[] posPositions = new int[8];
                           posPositions[0] = p - 9;
                           posPositions[1] = p - 8;
                           posPositions[2] = p - 7;
                           posPositions[3] = p - 1;
                           posPositions[4] = p + 1;
                           posPositions[5] = p + 7;
                           posPositions[6] = p + 8;
                           posPositions[7] = p + 9;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'B')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           } 
                        }
                         caseCounterK++;
                     }
                     if(caseCounterK == 2)
                     {
                        if(p >= 1 && p <= 6)
                        {
                           int[] posPositions = new int[5];
                           posPositions[0] = p - 1;
                           posPositions[1] = p + 1;
                           posPositions[2] = p + 7;
                           posPositions[3] = p + 8;
                           posPositions[4] = p + 9;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'B')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }                        
                        }
                        caseCounterK++;
                     }   
                     if(caseCounterK == 3)
                     {
                        if(p == 8 || p == 16 || p == 24 || p == 32 || p == 40 || p == 48)
                        {
                           int[] posPositions = new int[5];
                           posPositions[0] = p - 8;
                           posPositions[1] = p - 7;
                           posPositions[2] = p + 1;
                           posPositions[3] = p + 8;
                           posPositions[4] = p + 9;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'B')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }               
                     if(caseCounterK == 4)
                     {
                        if(p == 15 || p == 23 || p == 31 || p == 39 || p == 47 || p == 55)
                        {
                           int[] posPositions = new int[5];
                           posPositions[0] = p - 9;
                           posPositions[1] = p - 8;
                           posPositions[2] = p - 1;
                           posPositions[3] = p + 7;
                           posPositions[4] = p + 8;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'B')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }
                     if(caseCounterK == 5)
                     {
                        if(p >= 57 && p <= 62)
                        {
                           int[] posPositions = new int[5];
                           posPositions[0] = p - 9;
                           posPositions[1] = p - 8;
                           posPositions[2] = p - 7;
                           posPositions[3] = p - 1;
                           posPositions[4] = p + 1;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'B')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }      
                     if(caseCounterK == 6)
                     {
                        if(p == 0)
                        {
                           int[] posPositions = new int[3];
                           posPositions[0] = p + 1;
                           posPositions[1] = p + 8;
                           posPositions[2] = p + 9;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'B')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }
                     if(caseCounterK == 7)
                     {
                        if(p == 7)
                        {
                           int[] posPositions = new int[3];
                           posPositions[0] = p - 1;
                           posPositions[1] = p + 7;
                           posPositions[2] = p + 8;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'B')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }
                     if(caseCounterK == 8)
                     {
                        if(p == 56)
                        {
                           int[] posPositions = new int[3];
                           posPositions[0] = p - 8;
                           posPositions[1] = p - 7;
                           posPositions[2] = p + 1;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'B')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }
                     if(caseCounterK == 9)
                     {
                        if(p == 63)
                        {
                           int[] posPositions = new int[3];
                           posPositions[0] = p - 9;
                           posPositions[1] = p - 8;
                           posPositions[2] = p - 1;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'B')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }
                  }

         
         }
      
         if(g.whiteTurn == false)
         {
            while(caseCounterK < 10)
                  {
                     if(caseCounterK == 0)
                     {
                        if(p == 4)
                        {
                           for(int c = 0; c < movePString.length(); c++)
                           {
                              char h = movePString.charAt(c);
                           
                              if(h == 'F' && g.pieces[p+1] == " " && g.pieces[p+2] == " " && g.pieces[p+3].equals("BR.gifF"))
                              {
                                 int posPosition = p + 2;
                                 g.possibleMoves.add(posPosition);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPosition]);
                                 System.out.println(g.pieces[p+3]);
                              }
                              if(h == 'F' && g.pieces[p-1] == " " && g.pieces[p-2] == " " && g.pieces[p-3] == " " && g.pieces[p-4].equals("BR.gifF"))
                              {
                                 int posPosition = p - 2;
                                 g.possibleMoves.add(posPosition);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPosition]);
                              }
                           }
                        }
                        caseCounterK++;
                     }
                     if(caseCounterK == 1)
                     {
                        if((p >= 9 && p <= 14) || (p >= 17 && p <= 22) || (p >= 25 && p <= 30) ||
                           (p >= 33 && p <= 38) || (p >= 41 && p <= 46) || (p >= 49 && p <= 54))
                        {
                           int[] posPositions = new int[8];
                           posPositions[0] = p - 9;
                           posPositions[1] = p - 8;
                           posPositions[2] = p - 7;
                           posPositions[3] = p - 1;
                           posPositions[4] = p + 1;
                           posPositions[5] = p + 7;
                           posPositions[6] = p + 8;
                           posPositions[7] = p + 9;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'W')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           } 
                        }
                         caseCounterK++;
                     }
                     if(caseCounterK == 2)
                     {
                        if(p >= 1 && p <= 6)
                        {
                           int[] posPositions = new int[5];
                           posPositions[0] = p - 1;
                           posPositions[1] = p + 1;
                           posPositions[2] = p + 7;
                           posPositions[3] = p + 8;
                           posPositions[4] = p + 9;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'W')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }                        
                        }
                        caseCounterK++;
                     }   
                     if(caseCounterK == 3)
                     {
                        if(p == 8 || p == 16 || p == 24 || p == 32 || p == 40 || p == 48)
                        {
                           int[] posPositions = new int[5];
                           posPositions[0] = p - 8;
                           posPositions[1] = p - 7;
                           posPositions[2] = p + 1;
                           posPositions[3] = p + 8;
                           posPositions[4] = p + 9;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'W')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }               
                     if(caseCounterK == 4)
                     {
                        if(p == 15 || p == 23 || p == 31 || p == 39 || p == 47 || p == 55)
                        {
                           int[] posPositions = new int[5];
                           posPositions[0] = p - 9;
                           posPositions[1] = p - 8;
                           posPositions[2] = p - 1;
                           posPositions[3] = p + 7;
                           posPositions[4] = p + 8;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'W')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }
                     if(caseCounterK == 5)
                     {
                        if(p >= 57 && p <= 62)
                        {
                           int[] posPositions = new int[5];
                           posPositions[0] = p - 9;
                           posPositions[1] = p - 8;
                           posPositions[2] = p - 7;
                           posPositions[3] = p - 1;
                           posPositions[4] = p + 1;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'W')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }      
                     if(caseCounterK == 6)
                     {
                        if(p == 0)
                        {
                           int[] posPositions = new int[3];
                           posPositions[0] = p + 1;
                           posPositions[1] = p + 8;
                           posPositions[2] = p + 9;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'W')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }
                     if(caseCounterK == 7)
                     {
                        if(p == 7)
                        {
                           int[] posPositions = new int[3];
                           posPositions[0] = p - 1;
                           posPositions[1] = p + 7;
                           posPositions[2] = p + 8;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'W')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }
                     if(caseCounterK == 8)
                     {
                        if(p == 56)
                        {
                           int[] posPositions = new int[3];
                           posPositions[0] = p - 8;
                           posPositions[1] = p - 7;
                           posPositions[2] = p + 1;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'W')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }
                     if(caseCounterK == 9)
                     {
                        if(p == 63)
                        {
                           int[] posPositions = new int[3];
                           posPositions[0] = p - 9;
                           posPositions[1] = p - 8;
                           posPositions[2] = p - 1;
                           
                           for(int x = 0; x < posPositions.length; x++)
                           {
                              if(g.pieces[posPositions[x]] == " " || g.pieces[posPositions[x]].charAt(0) == 'W')
                              {
                                 g.possibleMoves.add(posPositions[x]);
                                 g.possibleMoveSquareColors.add(g.squareColors[posPositions[x]]);
                              }
                           }
                        }
                         caseCounterK++;
                     }
                  }

         }
      }


   }


}