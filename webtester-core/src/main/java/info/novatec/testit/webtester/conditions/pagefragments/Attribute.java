package info.novatec.testit.webtester.conditions.pagefragments;

import java.util.function.Predicate;

import info.novatec.testit.webtester.pagefragments.PageFragment;


/**
 * {@link Predicate} to be used in order to check if a specific attribute of a {@link PageFragment page fragment} is present.
 *
 * @see PageFragment#getAttribute(String)
 * @since 2.0
 */
public class Attribute implements Predicate<PageFragment> {

    private final String attributeName;

    /**
     * Creates a new {@link Attribute} condition. Using the given attribute.
     *
     * @param attributeName the name of the attribute to check
     */
    public Attribute(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public boolean test(PageFragment pageFragment) {
        return pageFragment.getAttribute(attributeName).isPresent();
    }

    @Override
    public String toString() {
        return String.format("attribute '%s'", attributeName);
    }

}