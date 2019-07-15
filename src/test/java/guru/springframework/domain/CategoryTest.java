package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4L;
        category.setId(4L);
        assertEquals(category.getId(), idValue);
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}