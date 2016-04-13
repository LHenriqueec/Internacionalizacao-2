package application;

import java.util.Locale;

public enum Language {
	LANGUAGE_BR {
		@Override
		public Locale getLanguage() {
			return new Locale("pt", "BR");
		}
	},
	LANGUAGE_US {
		@Override
		public Locale getLanguage() {
			return Locale.US;
		}
	};
	
	public abstract Locale getLanguage();
}
