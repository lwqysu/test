package ABXProject.lfc;


import java.io.IOException;
import cn.com.agree.ab.a5.runtime.sdk.annotation.LFC;
import cn.com.agree.ab.a5.runtime.sdk.AbstractLFC;
import cn.com.agree.ab.a5.runtime.sdk.Future;
import cn.com.agree.ab.a5.runtime.sdk.annotation.EndNext;
import cn.com.agree.ab.a5.runtime.sdk.annotation.Start;
import cn.com.agree.ab.a5.runtime.sdk.annotation.Step;
import cn.com.agree.ab.a5.runtime.sdk.enums.Out;

/**
 * @author
 * @description 
 */
@LFC
public class 测试 extends AbstractLFC
{


	@Start
	@Step(name = "start")
	public Future start() throws IOException
	{
		System.out.println("ffff");
		return Future.SUCCESS;
	}

}
