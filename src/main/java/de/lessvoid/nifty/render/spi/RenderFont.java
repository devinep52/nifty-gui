package de.lessvoid.nifty.render.spi;

import de.lessvoid.nifty.tools.Color;

/**
 * RenderFont Interface.
 * @author void
 */
public interface RenderFont {

  /**
   * Get width in pixel of given text.
   * @param text the text to measure.
   * @return the pixel width of the given text
   */
  int getWidth(String text);

  /**
   * The height of the font in pixel.
   * @return font height in pixel.
   */
  int getHeight();

  /**
   * Render the given text at the given position.
   * @param text text to render
   * @param x x position
   * @param y y position
   * @param fontColor font color
   * @param size size
   */
  void render(String text, int x, int y, Color fontColor, float size);

  /**
   * Return the advance of the given character including kerning information.
   * @param currentCharacter current character
   * @param nextCharacter next character
   * @param size font size
   * @return width of the character or null when no information for the character is available
   */
  Integer getCharacterAdvance(char currentCharacter, char nextCharacter, float size);
}