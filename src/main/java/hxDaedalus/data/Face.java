// Generated by Haxe 3.4.2
package hxDaedalus.data;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Face extends haxe.lang.HxObject
{
	static
	{
		//line 12 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		hxDaedalus.data.Face.INC = 0;
	}
	
	public Face(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Face()
	{
		//line 20 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		hxDaedalus.data.Face.__hx_ctor_hxDaedalus_data_Face(this);
	}
	
	
	public static void __hx_ctor_hxDaedalus_data_Face(hxDaedalus.data.Face __hx_this)
	{
		//line 18 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		__hx_this.colorDebug = -1;
		//line 21 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		__hx_this._id = hxDaedalus.data.Face.INC;
		//line 22 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		hxDaedalus.data.Face.INC++;
	}
	
	
	public static int INC;
	
	
	
	
	
	
	
	public int _id;
	
	public boolean _isReal;
	
	public hxDaedalus.data.Edge _edge;
	
	public int colorDebug;
	
	public int get_id()
	{
		//line 26 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		return this._id;
	}
	
	
	public boolean get_isReal()
	{
		//line 30 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		return this._isReal;
	}
	
	
	public void set_datas(hxDaedalus.data.Edge edge)
	{
		//line 34 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		this._isReal = true;
		//line 35 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		this._edge = edge;
	}
	
	
	public void setDatas(hxDaedalus.data.Edge edge, java.lang.Object isReal)
	{
		//line 39 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		boolean __temp_isReal5 = ( (haxe.lang.Runtime.eq(isReal, null)) ? (true) : (haxe.lang.Runtime.toBool(isReal)) );
		//line 40 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		this._isReal = __temp_isReal5;
		//line 41 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		this._edge = edge;
	}
	
	
	public void dispose()
	{
		//line 45 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		this._edge = null;
	}
	
	
	public hxDaedalus.data.Edge get_edge()
	{
		//line 49 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		return this._edge;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			switch (field.hashCode())
			{
				case 1264295088:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("colorDebug")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						this.colorDebug = ((int) (value) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 94650:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("_id")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						this._id = ((int) (value) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			switch (field.hashCode())
			{
				case 1264295088:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("colorDebug")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						this.colorDebug = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 94650:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("_id")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						this._id = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 90842780:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("_edge")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						this._edge = ((hxDaedalus.data.Edge) (value) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 1528312583:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("_isReal")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						this._isReal = haxe.lang.Runtime.toBool(value);
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			switch (field.hashCode())
			{
				case 1976220934:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("get_edge")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_edge")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 3355:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("id")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return this.get_id();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 1671767583:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("dispose")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispose")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case -1180158488:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("isReal")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return this.get_isReal();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 1390069447:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("setDatas")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setDatas")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 3108285:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("edge")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return this.get_edge();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 917689324:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("set_datas")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_datas")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 94650:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("_id")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return this._id;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 900519665:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("get_isReal")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_isReal")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 1528312583:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("_isReal")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return this._isReal;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case -1249338716:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("get_id")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_id")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 90842780:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("_edge")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return this._edge;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 1264295088:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("colorDebug")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return this.colorDebug;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			switch (field.hashCode())
			{
				case 1264295088:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("colorDebug")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return ((double) (this.colorDebug) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 3355:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("id")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return ((double) (this.get_id()) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 94650:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("_id")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return ((double) (this._id) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			switch (field.hashCode())
			{
				case 1976220934:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("get_edge")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return this.get_edge();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case -1249338716:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("get_id")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return this.get_id();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 1671767583:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("dispose")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						this.dispose();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 900519665:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("get_isReal")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						return this.get_isReal();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 1390069447:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("setDatas")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						this.setDatas(((hxDaedalus.data.Edge) (dynargs.__get(0)) ), dynargs.__get(1));
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
				case 917689324:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					if (field.equals("set_datas")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
						this.set_datas(((hxDaedalus.data.Edge) (dynargs.__get(0)) ));
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		baseArr.push("colorDebug");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		baseArr.push("_edge");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		baseArr.push("_isReal");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		baseArr.push("_id");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		baseArr.push("edge");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		baseArr.push("isReal");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		baseArr.push("id");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/Face.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


