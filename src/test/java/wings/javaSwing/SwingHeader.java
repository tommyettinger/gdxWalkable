// Generated by Haxe 3.4.2
package wings.javaSwing;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class SwingHeader extends haxe.lang.HxObject
{
	static
	{
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		{
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			java.lang.Object __temp_odecl3;
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				java.lang.Object __temp_odecl1 = new haxe.lang.DynamicObject(new java.lang.String[]{"static"}, new java.lang.Object[]{null}, new java.lang.String[]{}, new double[]{});
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				java.lang.Object __temp_odecl2 = new haxe.lang.DynamicObject(new java.lang.String[]{"static"}, new java.lang.Object[]{null}, new java.lang.String[]{}, new double[]{});
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				__temp_odecl3 = new haxe.lang.DynamicObject(new java.lang.String[]{"parseInt", "toHashColor"}, new java.lang.Object[]{__temp_odecl1, __temp_odecl2}, new java.lang.String[]{}, new double[]{});
			}
			
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			wings.javaSwing.SwingHeader.__meta__ = new haxe.lang.DynamicObject(new java.lang.String[]{"fields"}, new java.lang.Object[]{__temp_odecl3}, new java.lang.String[]{}, new double[]{});
		}
		
	}
	
	public SwingHeader(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public SwingHeader()
	{
		//line 13 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		wings.javaSwing.SwingHeader.__hx_ctor_wings_javaSwing_SwingHeader(this);
	}
	
	
	public static void __hx_ctor_wings_javaSwing_SwingHeader(wings.javaSwing.SwingHeader __hx_this)
	{
		//line 15 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		haxe.root.Array<java.lang.String> swingHeader = ((haxe.root.Array<java.lang.String>) (haxe.lang.Runtime.callField(null, "split", new haxe.root.Array(new java.lang.Object[]{":"}))) );
		//line 17 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		__hx_this.width = haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(swingHeader.__get(0)));
		//line 18 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		__hx_this.height = haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(swingHeader.__get(1)));
		//line 19 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		__hx_this.frameRate = haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(swingHeader.__get(2)));
		//line 20 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		__hx_this.bgColor = haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(swingHeader.__get(3)));
	}
	
	
	public static java.lang.Object __meta__;
	
	public int width;
	
	public int height;
	
	public int frameRate;
	
	public int bgColor;
	
	public final int parseInt(java.lang.String e)
	{
		//line 10 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		return haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(e));
	}
	
	
	public final java.lang.String toHashColor(java.lang.String e)
	{
		//line 11 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		return ( "#" + e );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		{
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			switch (field.hashCode())
			{
				case -204859874:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("bgColor")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						this.bgColor = ((int) (value) );
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return value;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("width")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						this.width = ((int) (value) );
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return value;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case 545057773:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("frameRate")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						this.frameRate = ((int) (value) );
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return value;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("height")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						this.height = ((int) (value) );
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return value;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		{
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			switch (field.hashCode())
			{
				case -204859874:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("bgColor")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						this.bgColor = haxe.lang.Runtime.toInt(value);
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return value;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("width")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						this.width = haxe.lang.Runtime.toInt(value);
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return value;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case 545057773:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("frameRate")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						this.frameRate = haxe.lang.Runtime.toInt(value);
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return value;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("height")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						this.height = haxe.lang.Runtime.toInt(value);
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return value;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		{
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			switch (field.hashCode())
			{
				case -338484550:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("toHashColor")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return new haxe.lang.Closure(this, "toHashColor");
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("width")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return this.width;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case 1187783740:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("parseInt")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return new haxe.lang.Closure(this, "parseInt");
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("height")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return this.height;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case -204859874:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("bgColor")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return this.bgColor;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case 545057773:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("frameRate")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return this.frameRate;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		{
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			switch (field.hashCode())
			{
				case -204859874:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("bgColor")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return this.bgColor;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("width")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return this.width;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case 545057773:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("frameRate")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return this.frameRate;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("height")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return this.height;
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		{
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			switch (field.hashCode())
			{
				case -338484550:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("toHashColor")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return this.toHashColor(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
				case 1187783740:
				{
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					if (field.equals("parseInt")) 
					{
						//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
                        //line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
						return this.parseInt(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
					break;
				}
				
				
			}
			
			//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		baseArr.push("bgColor");
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		baseArr.push("frameRate");
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		baseArr.push("height");
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		baseArr.push("width");
		//line 3 "/Users/tao/projects/hxDaedalus/src/wings/javaSwing/SwingHeader.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


