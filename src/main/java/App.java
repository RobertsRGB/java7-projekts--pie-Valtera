import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger(App.class);

        try {
            throw new RuntimeException("Nereāla kļūda");
        } catch (RuntimeException e) {
            log.error("Java7 Maven project", e);
        }

        log.trace("Java7 Maven project"); // kāpēc neparādās?
        log.debug("Java7 Maven project"); // kāpēc neparādās?
        log.info("Java7 Maven project"); //
        log.warn("Java7 Maven project"); //
        log.error("Java7 Maven project"); //

    }
}
