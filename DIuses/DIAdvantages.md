# DI 사용에 따른 장점

- 작은규모의 프로젝트에서는 스프링 DI 보다는 일반적인 방법이 더 빠르다.
- 하지만 규모가 커지고, 추후 유지보수 업무 발생시에는, DI를 이용하는 것이 더 좋다.

>main class
<pre><code>
AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpth:applicationCTX.xml");
Pencil pencil = ctx.getBean("pencil",Pencil.class);
pencil.use();

ctx.close();
</code></pre>

>xml file
<pre><code>
<bean id="pencil" class="Pencil4B"> //4B 굵기로 쓰입니다.
<bean id="pencil" class="Pencil6B"> //6B 굵기로 쓰입니다.
<bean id="pencil" class="Pencil6BWithEraser"> //6B 굵기로 쓰이고, 지우개가 있습니다.
</code></pre>


>> Java파일의 수정 없이 스프링 설정 파일만을 수정하여 부품들을 생성, 조립 (xml에서 class만 변경을 해도 main에서 안바꿔도 된다. (interface로 묶어서 pencil이라는 class type으로 묶이기 때문.) )


