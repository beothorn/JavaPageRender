package com.github.beothorn.html;

import com.github.beothorn.html.elements.Px;

public interface Unit extends Renderable{
	public static Px px(final int value){
		return new Px(value);
	}
	
}
