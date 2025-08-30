package com.techlabs.DesignPatternStructural.test;

import com.techlabs.DesignPatternStructural.model.CompositFileLeaf;
import com.techlabs.DesignPatternStructural.model.FolderComposite;

public class CompositePattern {

	 public static void main(String[] args) {
	        CompositFileLeaf file1 = new CompositFileLeaf("Resume.docx");
	        CompositFileLeaf file2 = new CompositFileLeaf("Photo.png");

	        FolderComposite folder1 = new FolderComposite("My Documents");
	        folder1.add(file1);
	        folder1.add(file2);

	        CompositFileLeaf file3 = new CompositFileLeaf("Project.zip");

	        FolderComposite mainFolder = new FolderComposite("C Drive");
	        mainFolder.add(folder1);
	        mainFolder.add(file3);

	        mainFolder.show();
	    }
}
