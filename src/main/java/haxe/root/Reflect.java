// Generated by Haxe 3.4.2
package haxe.root;

@SuppressWarnings(value={"rawtypes"})
public class Reflect extends haxe.lang.HxObject
{
	public Reflect(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Reflect()
	{
		haxe.root.Reflect.__hx_ctor__Reflect(this);
	}
	
	
	public static void __hx_ctor__Reflect(haxe.root.Reflect __hx_this)
	{
	}
	
	
	public static java.lang.Object field(java.lang.Object o, java.lang.String field)
	{
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			return ((haxe.lang.IHxObject) (o) ).__hx_getField(field, false, false, false);
		}
		
		return haxe.lang.Runtime.slowGetField(o, field, false);
	}
	
	
	public static void setField(java.lang.Object o, java.lang.String field, java.lang.Object value)
	{
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			((haxe.lang.IHxObject) (o) ).__hx_setField(field, value, false);
		}
		else
		{
			haxe.lang.Runtime.slowSetField(o, field, value);
		}
		
	}
	
	
	public static haxe.root.Array<java.lang.String> fields(java.lang.Object o)
	{
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			haxe.root.Array<java.lang.String> ret = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			((haxe.lang.IHxObject) (o) ).__hx_getFields(ret);
			return ret;
		}
		else
		{
			if (( o instanceof java.lang.Class )) 
			{
				return haxe.root.Type.getClassFields(((java.lang.Class) (o) ));
			}
			else
			{
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			}
			
		}
		
	}
	
	
}


