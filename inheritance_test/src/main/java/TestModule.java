import com.google.inject.AbstractModule;

public class TestModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CustomerGroup.class).to(CustomerSet.class);
    }
}
