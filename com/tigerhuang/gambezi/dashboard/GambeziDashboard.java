package com.tigerhuang.gambezi.dashboard;

import com.tigerhuang.gambezi.Gambezi;
import com.tigerhuang.gambezi.OnUpdateListener;

////////////////////////////////////////////////////////////////////////////////
/**
 * Represents a dashboard based on gambezi
 */
public class GambeziDashboard {
	/**
	 * The shared gambezi instance
	 */
	private static Gambezi instance;

	/**
	 * Gets the gambezi instance
	 */
	public static Gambezi get_instance() {
		if(instance == null) {
			instance = new Gambezi("localhost:5809");
		}
		return instance;
	}

	public static void set_data(String key, byte[] data, int offset, int length) {
		GambeziDashboard.get_instance().get_node(key).set_data(data, offset, length);
	}
	public static byte[] get_data(String key) {
		return GambeziDashboard.get_instance().get_node(key).get_data();
	}

	public static void set_double(String key, double value) {
		GambeziDashboard.get_instance().get_node(key).set_double(value);
	}
	public static double get_double(String key) {
		return GambeziDashboard.get_instance().get_node(key).get_double();
	}

	public static void set_boolean(String key, boolean value) {
		GambeziDashboard.get_instance().get_node(key).set_boolean(value);
	}
	public static boolean get_boolean(String key) {
		return GambeziDashboard.get_instance().get_node(key).get_boolean();
	}

	public static void set_string(String key, String value) {
		GambeziDashboard.get_instance().get_node(key).set_string(value);
	}
	public static String get_string(String key) {
		return GambeziDashboard.get_instance().get_node(key).get_string();
	}

	public static void listen_button(String key, OnUpdateListener listener) {
		GambeziDashboard.get_instance().get_node(key).set_subscription(0);
		GambeziDashboard.get_instance().get_node(key).on_update = listener;
	}

	public static void log_string(String message) {
		GambeziDashboard.get_instance().get_node("gambezi/log").set_string(message);
	}
}
