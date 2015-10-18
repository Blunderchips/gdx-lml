package com.github.czyzby.lml.parser.impl.attribute.scroll;

import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlAttribute;
import com.github.czyzby.lml.parser.tag.LmlTag;

/** See {@link ScrollPane#setScrollingDisabled(boolean, boolean)}. Sets X scrolling to the parsed value and Y to default
 * value: true, because there were no getters or individual setters available. If you want to disable both, use
 * {@link ScrollDisabledLmlAttribute} instead. Mapped to "disableX", "disabledX".
 *
 * @author MJ */
public class ScrollDisabledXLmlAttribute implements LmlAttribute<ScrollPane> {
    @Override
    public Class<ScrollPane> getHandledType() {
        return ScrollPane.class;
    }

    @Override
    public void process(final LmlParser parser, final LmlTag tag, final ScrollPane actor,
            final String rawAttributeData) {
        actor.setScrollingDisabled(parser.parseBoolean(rawAttributeData, actor), true);
    }
}
