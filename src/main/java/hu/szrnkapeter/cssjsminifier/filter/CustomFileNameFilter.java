package hu.szrnkapeter.cssjsminifier.filter;

import java.io.File;
import java.io.FilenameFilter;

public class CustomFileNameFilter implements FilenameFilter {

	private String extension;

	public CustomFileNameFilter(final String extension) {
		this.extension = extension;
	}

	@Override
	public boolean accept(final File dir, final String name) {
		name.toLowerCase().endsWith(extension);
		return false;
	}

}