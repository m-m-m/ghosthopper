/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.ghosthopper.object;

/**
 * This is the abstract base class for any play object of this game.
 */
public abstract class GameObjectBase implements GameObject {

  /**
   * The constructor.
   */
  public GameObjectBase() {
    super();
  }

  @Override
  public String toString() {

    return getId();
  }

}