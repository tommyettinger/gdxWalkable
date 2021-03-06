// Generated by Haxe 3.4.2
package hxPixels;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PixelFormat extends haxe.lang.HxObject
{
	static
	{
		{
			hxPixels.PixelFormat.ARGB = new hxPixels.PixelFormat(0, 1, 2, 3, "ARGB");
			hxPixels.PixelFormat.RGBA = new hxPixels.PixelFormat(3, 0, 1, 2, "RGBA");
			hxPixels.PixelFormat.BGRA = new hxPixels.PixelFormat(3, 2, 1, 0, "BGRA");
		}
		
	}
	
	public PixelFormat(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public PixelFormat(int a, int r, int g, int b, java.lang.String name)
	{
		hxPixels.PixelFormat.__hx_ctor_hxPixels_PixelFormat(this, a, r, g, b, name);
	}
	
	
	public static void __hx_ctor_hxPixels_PixelFormat(hxPixels.PixelFormat __hx_this, int a, int r, int g, int b, java.lang.String name)
	{
		if (( name == null )) 
		{
			name = "PixelFormat";
		}
		
		__hx_this.channelMap = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{a, r, g, b});
		__hx_this.ch0 = a;
		__hx_this.ch1 = r;
		__hx_this.ch2 = g;
		__hx_this.ch3 = b;
		__hx_this.name = name;
	}
	
	
	public static hxPixels.PixelFormat ARGB;
	
	public static hxPixels.PixelFormat RGBA;
	
	public static hxPixels.PixelFormat BGRA;
	
	public haxe.root.Array<java.lang.Object> channelMap;
	
	public int ch0;
	
	public int ch1;
	
	public int ch2;
	
	public int ch3;
	
	public java.lang.String name;
	
	public int A;
	
	public final int get_A()
	{
		return this.ch0;
	}
	
	
	public int R;
	
	public final int get_R()
	{
		return this.ch1;
	}
	
	
	public int G;
	
	public final int get_G()
	{
		return this.ch2;
	}
	
	
	public int B;
	
	public final int get_B()
	{
		return this.ch3;
	}
	
	
	@Override public java.lang.String toString()
	{
		return this.name;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case 66:
				{
					if (field.equals("B")) 
					{
						this.B = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 98411:
				{
					if (field.equals("ch0")) 
					{
						this.ch0 = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 71:
				{
					if (field.equals("G")) 
					{
						this.G = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 98412:
				{
					if (field.equals("ch1")) 
					{
						this.ch1 = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 82:
				{
					if (field.equals("R")) 
					{
						this.R = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 98413:
				{
					if (field.equals("ch2")) 
					{
						this.ch2 = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 65:
				{
					if (field.equals("A")) 
					{
						this.A = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 98414:
				{
					if (field.equals("ch3")) 
					{
						this.ch3 = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case 66:
				{
					if (field.equals("B")) 
					{
						this.B = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case -1930826407:
				{
					if (field.equals("channelMap")) 
					{
						this.channelMap = ((haxe.root.Array<java.lang.Object>) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 71:
				{
					if (field.equals("G")) 
					{
						this.G = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 98411:
				{
					if (field.equals("ch0")) 
					{
						this.ch0 = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 82:
				{
					if (field.equals("R")) 
					{
						this.R = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 98412:
				{
					if (field.equals("ch1")) 
					{
						this.ch1 = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 65:
				{
					if (field.equals("A")) 
					{
						this.A = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 98413:
				{
					if (field.equals("ch2")) 
					{
						this.ch2 = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 3373707:
				{
					if (field.equals("name")) 
					{
						this.name = haxe.lang.Runtime.toString(value);
						return value;
					}
					
					break;
				}
				
				
				case 98414:
				{
					if (field.equals("ch3")) 
					{
						this.ch3 = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						return new haxe.lang.Closure(this, "toString");
					}
					
					break;
				}
				
				
				case -1930826407:
				{
					if (field.equals("channelMap")) 
					{
						return this.channelMap;
					}
					
					break;
				}
				
				
				case 98246041:
				{
					if (field.equals("get_B")) 
					{
						return new haxe.lang.Closure(this, "get_B");
					}
					
					break;
				}
				
				
				case 98411:
				{
					if (field.equals("ch0")) 
					{
						return this.ch0;
					}
					
					break;
				}
				
				
				case 66:
				{
					if (field.equals("B")) 
					{
						if (handleProperties)
						{
							return this.get_B();
						}
						else
						{
							return this.B;
						}
						
					}
					
					break;
				}
				
				
				case 98412:
				{
					if (field.equals("ch1")) 
					{
						return this.ch1;
					}
					
					break;
				}
				
				
				case 98246046:
				{
					if (field.equals("get_G")) 
					{
						return new haxe.lang.Closure(this, "get_G");
					}
					
					break;
				}
				
				
				case 98413:
				{
					if (field.equals("ch2")) 
					{
						return this.ch2;
					}
					
					break;
				}
				
				
				case 71:
				{
					if (field.equals("G")) 
					{
						if (handleProperties)
						{
							return this.get_G();
						}
						else
						{
							return this.G;
						}
						
					}
					
					break;
				}
				
				
				case 98414:
				{
					if (field.equals("ch3")) 
					{
						return this.ch3;
					}
					
					break;
				}
				
				
				case 98246057:
				{
					if (field.equals("get_R")) 
					{
						return new haxe.lang.Closure(this, "get_R");
					}
					
					break;
				}
				
				
				case 3373707:
				{
					if (field.equals("name")) 
					{
						return this.name;
					}
					
					break;
				}
				
				
				case 82:
				{
					if (field.equals("R")) 
					{
						if (handleProperties)
						{
							return this.get_R();
						}
						else
						{
							return this.R;
						}
						
					}
					
					break;
				}
				
				
				case 65:
				{
					if (field.equals("A")) 
					{
						if (handleProperties)
						{
							return this.get_A();
						}
						else
						{
							return this.A;
						}
						
					}
					
					break;
				}
				
				
				case 98246040:
				{
					if (field.equals("get_A")) 
					{
						return new haxe.lang.Closure(this, "get_A");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case 66:
				{
					if (field.equals("B")) 
					{
						if (handleProperties)
						{
							return this.get_B();
						}
						else
						{
							return this.B;
						}
						
					}
					
					break;
				}
				
				
				case 98411:
				{
					if (field.equals("ch0")) 
					{
						return this.ch0;
					}
					
					break;
				}
				
				
				case 71:
				{
					if (field.equals("G")) 
					{
						if (handleProperties)
						{
							return this.get_G();
						}
						else
						{
							return this.G;
						}
						
					}
					
					break;
				}
				
				
				case 98412:
				{
					if (field.equals("ch1")) 
					{
						return this.ch1;
					}
					
					break;
				}
				
				
				case 82:
				{
					if (field.equals("R")) 
					{
						if (handleProperties)
						{
							return this.get_R();
						}
						else
						{
							return this.R;
						}
						
					}
					
					break;
				}
				
				
				case 98413:
				{
					if (field.equals("ch2")) 
					{
						return this.ch2;
					}
					
					break;
				}
				
				
				case 65:
				{
					if (field.equals("A")) 
					{
						if (handleProperties)
						{
							return this.get_A();
						}
						else
						{
							return this.A;
						}
						
					}
					
					break;
				}
				
				
				case 98414:
				{
					if (field.equals("ch3")) 
					{
						return this.ch3;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						return this.toString();
					}
					
					break;
				}
				
				
				case 98246040:
				{
					if (field.equals("get_A")) 
					{
						return this.get_A();
					}
					
					break;
				}
				
				
				case 98246041:
				{
					if (field.equals("get_B")) 
					{
						return this.get_B();
					}
					
					break;
				}
				
				
				case 98246057:
				{
					if (field.equals("get_R")) 
					{
						return this.get_R();
					}
					
					break;
				}
				
				
				case 98246046:
				{
					if (field.equals("get_G")) 
					{
						return this.get_G();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("B");
		baseArr.push("G");
		baseArr.push("R");
		baseArr.push("A");
		baseArr.push("name");
		baseArr.push("ch3");
		baseArr.push("ch2");
		baseArr.push("ch1");
		baseArr.push("ch0");
		baseArr.push("channelMap");
		super.__hx_getFields(baseArr);
	}
	
	
}


