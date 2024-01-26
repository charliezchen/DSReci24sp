/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/** Generates a simple progression. By default: 0, 1, 2, ... */
public class Progression extends AbstractProgression {

  /** Constructs a progression starting at zero. */
  public Progression() { this(0); }

  /** Constructs a progression with given start value. */
  public Progression(long start) { current = start; }

  /** Advances the current value to the next value of the progression. */
  protected void advance() {
    current++;
  }

  public static void main(String[] args) {
    Progression prog = new Progression();
    prog.printProgression(10);
  }

}
