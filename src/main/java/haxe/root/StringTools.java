// Generated by Haxe 3.4.2
package haxe.root;

public class StringTools extends haxe.lang.HxObject
{
	public StringTools(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringTools()
	{
		haxe.root.StringTools.__hx_ctor__StringTools(this);
	}
	
	
	public static void __hx_ctor__StringTools(haxe.root.StringTools __hx_this)
	{
	}
	
	
	public static boolean isSpace(java.lang.String s, int pos)
	{
		java.lang.Object c = haxe.lang.StringExt.charCodeAt(s, pos);
		if ( ! ((( ( haxe.lang.Runtime.compare(c, 8) > 0 ) && ( haxe.lang.Runtime.compare(c, 14) < 0 ) ))) ) 
		{
			return haxe.lang.Runtime.eq(c, 32);
		}
		else
		{
			return true;
		}
		
	}
	
	
	public static java.lang.String ltrim(java.lang.String s)
	{
		int l = s.length();
		int r = 0;
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, r) ))
		{
			 ++ r;
		}
		
		if (( r > 0 )) 
		{
			return haxe.lang.StringExt.substr(s, r, ( l - r ));
		}
		else
		{
			return s;
		}
		
	}
	
	
}


