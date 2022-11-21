package org.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void bef() {
		System.out.println("BeforeScenario>>>>>");
		chromeBrowser();
		maxWindow();
	}

	@After
	public void aft() {
		System.out.println("AfterScenario>>>>>");
		closeBrowser();
	}

	@Before(order = 2)
	public void befSce2() {
		System.out.println("bef sce2");
	}

	@Before(order = 1)
	public void befSce1() {
		System.out.println("bef sce1");
	}

	@Before(order = 3)
	public void befSce13() {
		System.out.println("bef sce13");
	}

	@After(order = 1)
	public void aftSce1() {
		System.out.println("aft sce1");
	}

	@After(order = 3)
	public void aftSce3() {
		System.out.println("aft sce3");
	}

	@After(order = 2)
	public void aftSce2() {
		System.out.println("aft sce2");
	}

}
