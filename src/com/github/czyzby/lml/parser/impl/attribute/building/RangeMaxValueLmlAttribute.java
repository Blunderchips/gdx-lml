package com.github.czyzby.lml.parser.impl.attribute.building;

import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;
import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.impl.tag.builder.FloatRangeLmlActorBuilder;
import com.github.czyzby.lml.parser.tag.LmlBuildingAttribute;
import com.github.czyzby.lml.parser.tag.LmlTag;

/** Used to parse max value of numeric range widgets. Expects a float. Mapped to "max".
 *
 * @author MJ */
public class RangeMaxValueLmlAttribute implements LmlBuildingAttribute<FloatRangeLmlActorBuilder> {
    @Override
    public Class<?>[] getHandledTypes() {
        return new Class<?>[] { ProgressBar.class, Slider.class };
    }

    @Override
    public boolean process(final LmlParser parser, final LmlTag tag, final FloatRangeLmlActorBuilder builder,
            final String rawAttributeData) {
        builder.setMax(parser.parseFloat(rawAttributeData));
        return FULLY_PARSED;
    }
}
