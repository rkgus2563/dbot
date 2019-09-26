package dbot;

import listener.LunchListiner;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

public class MainApp {
		public static void main(String[] args) {
			JDABuilder builder = new JDABuilder(AccountType.BOT);
			String token = "NjI2NjA5NjE5ODEyMzUyMDIx.XYwoJA.5Az5PgiNvDjtc-GPWv5hGqSJtZQ";
			builder.setToken(token);
			
			try {
				builder.addEventListeners(new LunchListiner());
				builder.build();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
