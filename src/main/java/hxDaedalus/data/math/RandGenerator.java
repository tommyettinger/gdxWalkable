// Generated by Haxe 3.4.2
package hxDaedalus.data.math;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class RandGenerator extends haxe.lang.HxObject
{
	public RandGenerator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public RandGenerator(java.lang.Object seed, java.lang.Object rangeMin_, java.lang.Object rangeMax_)
	{
		hxDaedalus.data.math.RandGenerator.__hx_ctor_hxDaedalus_data_math_RandGenerator(this, seed, rangeMin_, rangeMax_);
	}
	
	
	public static void __hx_ctor_hxDaedalus_data_math_RandGenerator(hxDaedalus.data.math.RandGenerator __hx_this, java.lang.Object seed, java.lang.Object rangeMin_, java.lang.Object rangeMax_)
	{
		int __temp_rangeMax_19 = ( (haxe.lang.Runtime.eq(rangeMax_, null)) ? (1) : haxe.lang.Runtime.toInt(rangeMax_));
		int __temp_rangeMin_18 = ( (haxe.lang.Runtime.eq(rangeMin_, null)) ? (0) : haxe.lang.Runtime.toInt(rangeMin_));
		int __temp_seed17 = ( (haxe.lang.Runtime.eq(seed, null)) ? (1234) : haxe.lang.Runtime.toInt(seed));
		__hx_this._originalSeed = __hx_this._currSeed = __temp_seed17;
		__hx_this.rangeMin = __temp_rangeMin_18;
		__hx_this.rangeMax = __temp_rangeMax_19;
		__hx_this._numIter = 0;
	}
	
	
	
	
	public int rangeMin;
	
	public int rangeMax;
	
	public int _originalSeed;
	
	public int _currSeed;
	
	public int _rangeMin;
	
	public int _rangeMax;
	
	public int _numIter;
	
	public java.lang.String _tempString;
	
	public int set_seed(int value)
	{
		this._originalSeed = this._currSeed = value;
		return value;
	}
	
	
	public int get_seed()
	{
		return this._originalSeed;
	}
	
	
	public void reset()
	{
		this._currSeed = this._originalSeed;
		this._numIter = 0;
	}
	
	
	public int next()
	{
		double _floatSeed = ( this._currSeed * 1.0 );
		this._tempString = haxe.root.Std.string(( _floatSeed * _floatSeed ));
		while (( this._tempString.length() < 8 ))
		{
			this._tempString = ( "0" + this._tempString );
		}
		
		this._currSeed = haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(haxe.lang.StringExt.substr(this._tempString, 1, 5)));
		int res = ((int) (java.lang.Math.round(( this.rangeMin + ( ( ((double) (this._currSeed) ) / 99999 ) * (( this.rangeMax - this.rangeMin )) ) ))) );
		if (( this._currSeed == 0 )) 
		{
			this._currSeed = ( this._originalSeed + this._numIter );
		}
		
		this._numIter++;
		if (( this._numIter == 200 )) 
		{
			this.reset();
		}
		
		return res;
	}
	
	
	public int nextInRange(int rangeMin, int rangeMax)
	{
		this.rangeMin = rangeMin;
		this.rangeMax = rangeMax;
		return this.next();
	}
	
	
	public <T> void shuffle(haxe.root.Array<T> array)
	{
		int currIdx = array.length;
		while (( currIdx > 0 ))
		{
			int rndIdx = this.nextInRange(0, ( currIdx - 1 ));
			 -- currIdx;
			T tmp = array.__get(currIdx);
			array.__set(currIdx, array.__get(rndIdx));
			array.__set(rndIdx, tmp);
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case 356978303:
				{
					if (field.equals("_numIter")) 
					{
						this._numIter = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 3526257:
				{
					if (field.equals("seed")) 
					{
						this.set_seed(((int) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case 343359558:
				{
					if (field.equals("_rangeMax")) 
					{
						this._rangeMax = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 252841941:
				{
					if (field.equals("rangeMin")) 
					{
						this.rangeMin = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 343359796:
				{
					if (field.equals("_rangeMin")) 
					{
						this._rangeMin = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 252841703:
				{
					if (field.equals("rangeMax")) 
					{
						this.rangeMax = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 665375010:
				{
					if (field.equals("_currSeed")) 
					{
						this._currSeed = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 34465217:
				{
					if (field.equals("_originalSeed")) 
					{
						this._originalSeed = ((int) (value) );
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
				case 1694086820:
				{
					if (field.equals("_tempString")) 
					{
						this._tempString = haxe.lang.Runtime.toString(value);
						return value;
					}
					
					break;
				}
				
				
				case 3526257:
				{
					if (field.equals("seed")) 
					{
						this.set_seed(haxe.lang.Runtime.toInt(value));
						return value;
					}
					
					break;
				}
				
				
				case 356978303:
				{
					if (field.equals("_numIter")) 
					{
						this._numIter = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 252841941:
				{
					if (field.equals("rangeMin")) 
					{
						this.rangeMin = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 343359558:
				{
					if (field.equals("_rangeMax")) 
					{
						this._rangeMax = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 252841703:
				{
					if (field.equals("rangeMax")) 
					{
						this.rangeMax = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 343359796:
				{
					if (field.equals("_rangeMin")) 
					{
						this._rangeMin = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 34465217:
				{
					if (field.equals("_originalSeed")) 
					{
						this._originalSeed = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 665375010:
				{
					if (field.equals("_currSeed")) 
					{
						this._currSeed = haxe.lang.Runtime.toInt(value);
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
				case 2072332025:
				{
					if (field.equals("shuffle")) 
					{
						return new haxe.lang.Closure(this, "shuffle");
					}
					
					break;
				}
				
				
				case 3526257:
				{
					if (field.equals("seed")) 
					{
						return this.get_seed();
					}
					
					break;
				}
				
				
				case -1016590171:
				{
					if (field.equals("nextInRange")) 
					{
						return new haxe.lang.Closure(this, "nextInRange");
					}
					
					break;
				}
				
				
				case 252841941:
				{
					if (field.equals("rangeMin")) 
					{
						return this.rangeMin;
					}
					
					break;
				}
				
				
				case 3377907:
				{
					if (field.equals("next")) 
					{
						return new haxe.lang.Closure(this, "next");
					}
					
					break;
				}
				
				
				case 252841703:
				{
					if (field.equals("rangeMax")) 
					{
						return this.rangeMax;
					}
					
					break;
				}
				
				
				case 108404047:
				{
					if (field.equals("reset")) 
					{
						return new haxe.lang.Closure(this, "reset");
					}
					
					break;
				}
				
				
				case 34465217:
				{
					if (field.equals("_originalSeed")) 
					{
						return this._originalSeed;
					}
					
					break;
				}
				
				
				case 1976638906:
				{
					if (field.equals("get_seed")) 
					{
						return new haxe.lang.Closure(this, "get_seed");
					}
					
					break;
				}
				
				
				case 665375010:
				{
					if (field.equals("_currSeed")) 
					{
						return this._currSeed;
					}
					
					break;
				}
				
				
				case 1415526446:
				{
					if (field.equals("set_seed")) 
					{
						return new haxe.lang.Closure(this, "set_seed");
					}
					
					break;
				}
				
				
				case 343359796:
				{
					if (field.equals("_rangeMin")) 
					{
						return this._rangeMin;
					}
					
					break;
				}
				
				
				case 1694086820:
				{
					if (field.equals("_tempString")) 
					{
						return this._tempString;
					}
					
					break;
				}
				
				
				case 343359558:
				{
					if (field.equals("_rangeMax")) 
					{
						return this._rangeMax;
					}
					
					break;
				}
				
				
				case 356978303:
				{
					if (field.equals("_numIter")) 
					{
						return this._numIter;
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
				case 356978303:
				{
					if (field.equals("_numIter")) 
					{
						return this._numIter;
					}
					
					break;
				}
				
				
				case 3526257:
				{
					if (field.equals("seed")) 
					{
						return this.get_seed();
					}
					
					break;
				}
				
				
				case 343359558:
				{
					if (field.equals("_rangeMax")) 
					{
						return this._rangeMax;
					}
					
					break;
				}
				
				
				case 252841941:
				{
					if (field.equals("rangeMin")) 
					{
						return this.rangeMin;
					}
					
					break;
				}
				
				
				case 343359796:
				{
					if (field.equals("_rangeMin")) 
					{
						return this._rangeMin;
					}
					
					break;
				}
				
				
				case 252841703:
				{
					if (field.equals("rangeMax")) 
					{
						return this.rangeMax;
					}
					
					break;
				}
				
				
				case 665375010:
				{
					if (field.equals("_currSeed")) 
					{
						return this._currSeed;
					}
					
					break;
				}
				
				
				case 34465217:
				{
					if (field.equals("_originalSeed")) 
					{
						return this._originalSeed;
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
				case 2072332025:
				{
					if (field.equals("shuffle")) 
					{
						this.shuffle(((haxe.root.Array<java.lang.Object>) (dynargs.__get(0)) ));
						return null;
					}
					
					break;
				}
				
				
				case 1415526446:
				{
					if (field.equals("set_seed")) 
					{
						return this.set_seed(haxe.lang.Runtime.toInt(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case -1016590171:
				{
					if (field.equals("nextInRange")) 
					{
						return this.nextInRange(haxe.lang.Runtime.toInt(dynargs.__get(0)), haxe.lang.Runtime.toInt(dynargs.__get(1)));
					}
					
					break;
				}
				
				
				case 1976638906:
				{
					if (field.equals("get_seed")) 
					{
						return this.get_seed();
					}
					
					break;
				}
				
				
				case 3377907:
				{
					if (field.equals("next")) 
					{
						return this.next();
					}
					
					break;
				}
				
				
				case 108404047:
				{
					if (field.equals("reset")) 
					{
						__temp_executeDef1 = false;
						this.reset();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("_tempString");
		baseArr.push("_numIter");
		baseArr.push("_rangeMax");
		baseArr.push("_rangeMin");
		baseArr.push("_currSeed");
		baseArr.push("_originalSeed");
		baseArr.push("rangeMax");
		baseArr.push("rangeMin");
		baseArr.push("seed");
		super.__hx_getFields(baseArr);
	}
	
	
}


