package com.tigerhuang.gambezi;

import com.tigerhuang.gambezi.Gambezi;

////////////////////////////////////////////////////////////////////////////////
/**
 * Represents a dashboard based on gambezi
 */
public class Gambezi_Dashboard {
	// The current gambezi dashboard instance
	private static Gambezi_Dashboard instance;

	// The current gambezi instance
	private Gambezi gambezi;

	/**
	 * Constructs a gambezi dashboard instance
	 */
	private Gambezi_Dashboard() {
		gambezi = new Gambezi("localhost:7709", true, 5);
	}

	/**
	 * Gets the gambezi instance
	 */
	private static Gambezi_Dashboard get_instance() {
		if(instance == null) {
			instance = new Gambezi_Dashboard();
		}
		return instance;
	}
}
