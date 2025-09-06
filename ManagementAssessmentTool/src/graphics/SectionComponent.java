package graphics;

import java.awt.Color;
import java.awt.Container;

import javax.swing.SpringLayout;

import objects.Section;
import objects.SectionMaker;

public class SectionComponent extends Container {

	private static final long serialVersionUID = 1L;

	public SectionComponent() {
		setLayout(new SpringLayout());
		
		SectionMaker.makeSections();
		for (Section section : SectionMaker.getSections()) {
			
		}
	}
	
}
