package tw.sunteam.example.test_001.ejb;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(Arquillian.class)
public class Service01case {

	@Inject
	Service01 service;

	@Deployment
	public static JavaArchive createDeployment() {
		return ShrinkWrap.create(JavaArchive.class)
				.addClass(Service01.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	}
	
	
	@Test
	public void test(){
		Assert.assertEquals("SUCCESS", service.test());
	}
	
}
