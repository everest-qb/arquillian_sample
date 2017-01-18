package tw.sunteam.example.test_001;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jboss.arquillian.junit.Arquillian;

@RunWith(Arquillian.class)
public class GreeterTest {

	@Deployment
	public static JavaArchive createDeployment() {
		 JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
			        .addClasses(Greeter.class,PhraseBuilder.class)
			        .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
			    System.out.println(jar.toString(true));
			    return jar;
	}

	@Inject
	Greeter greeter;

	@Test
	public void should_create_greeting() {
		Assert.assertEquals("Hello, Earthling!", greeter.createGreeting("Earthling"));
		greeter.greet(System.out, "Earthling");
	}
}
