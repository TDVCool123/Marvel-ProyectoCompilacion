/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package upb.du.dti.isc.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import upb.du.dti.isc.ide.contentassist.antlr.internal.InternalCompParser;
import upb.du.dti.isc.services.CompGrammarAccess;

public class CompParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CompGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CompGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getParamAccess().getAlternatives(), "rule__Param__Alternatives");
			builder.put(grammarAccess.getCondIterAccess().getAlternatives(), "rule__CondIter__Alternatives");
			builder.put(grammarAccess.getInstruccionAccess().getAlternatives(), "rule__Instruccion__Alternatives");
			builder.put(grammarAccess.getComparacionAccess().getOpAlternatives_1_1_0(), "rule__Comparacion__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getIgualOrDiferenteAccess().getOpAlternatives_1_1_0(), "rule__IgualOrDiferente__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getOperacionAritmeticaAccess().getOpAlternatives_1_1_0(), "rule__OperacionAritmetica__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getExpSimpAccess().getAlternatives(), "rule__ExpSimp__Alternatives");
			builder.put(grammarAccess.getExpSimpAccess().getValorBAlternatives_1_1_0(), "rule__ExpSimp__ValorBAlternatives_1_1_0");
			builder.put(grammarAccess.getInicioAccess().getGroup(), "rule__Inicio__Group__0");
			builder.put(grammarAccess.getVarGoblalAccess().getGroup(), "rule__VarGoblal__Group__0");
			builder.put(grammarAccess.getMetodoAccess().getGroup(), "rule__Metodo__Group__0");
			builder.put(grammarAccess.getMetodoAccess().getGroup_3(), "rule__Metodo__Group_3__0");
			builder.put(grammarAccess.getMetodoAccess().getGroup_3_1(), "rule__Metodo__Group_3_1__0");
			builder.put(grammarAccess.getTipoDoubleAccess().getGroup(), "rule__TipoDouble__Group__0");
			builder.put(grammarAccess.getTipoBooleanAccess().getGroup(), "rule__TipoBoolean__Group__0");
			builder.put(grammarAccess.getTipoStringAccess().getGroup(), "rule__TipoString__Group__0");
			builder.put(grammarAccess.getTipoIntAccess().getGroup(), "rule__TipoInt__Group__0");
			builder.put(grammarAccess.getAsignacionAccess().getGroup(), "rule__Asignacion__Group__0");
			builder.put(grammarAccess.getLlamadoMetodoAccess().getGroup(), "rule__LlamadoMetodo__Group__0");
			builder.put(grammarAccess.getLlamadoMetodoAccess().getGroup_3(), "rule__LlamadoMetodo__Group_3__0");
			builder.put(grammarAccess.getLlamadoMetodoAccess().getGroup_3_1(), "rule__LlamadoMetodo__Group_3_1__0");
			builder.put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
			builder.put(grammarAccess.getConcatenacionAccess().getGroup(), "rule__Concatenacion__Group__0");
			builder.put(grammarAccess.getConcatenacionAccess().getGroup_1(), "rule__Concatenacion__Group_1__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getComparacionAccess().getGroup(), "rule__Comparacion__Group__0");
			builder.put(grammarAccess.getComparacionAccess().getGroup_1(), "rule__Comparacion__Group_1__0");
			builder.put(grammarAccess.getIgualOrDiferenteAccess().getGroup(), "rule__IgualOrDiferente__Group__0");
			builder.put(grammarAccess.getIgualOrDiferenteAccess().getGroup_1(), "rule__IgualOrDiferente__Group_1__0");
			builder.put(grammarAccess.getModuloAccess().getGroup(), "rule__Modulo__Group__0");
			builder.put(grammarAccess.getModuloAccess().getGroup_1(), "rule__Modulo__Group_1__0");
			builder.put(grammarAccess.getOperacionAritmeticaAccess().getGroup(), "rule__OperacionAritmetica__Group__0");
			builder.put(grammarAccess.getOperacionAritmeticaAccess().getGroup_1(), "rule__OperacionAritmetica__Group_1__0");
			builder.put(grammarAccess.getExpSimpAccess().getGroup_0(), "rule__ExpSimp__Group_0__0");
			builder.put(grammarAccess.getExpSimpAccess().getGroup_1(), "rule__ExpSimp__Group_1__0");
			builder.put(grammarAccess.getExpSimpAccess().getGroup_2(), "rule__ExpSimp__Group_2__0");
			builder.put(grammarAccess.getExpSimpAccess().getGroup_3(), "rule__ExpSimp__Group_3__0");
			builder.put(grammarAccess.getExpSimpAccess().getGroup_4(), "rule__ExpSimp__Group_4__0");
			builder.put(grammarAccess.getBloqueInstruccionesAccess().getGroup(), "rule__BloqueInstrucciones__Group__0");
			builder.put(grammarAccess.getSoulGemAccess().getGroup(), "rule__SoulGem__Group__0");
			builder.put(grammarAccess.getMindGemAccess().getGroup(), "rule__MindGem__Group__0");
			builder.put(grammarAccess.getTimeGemAccess().getGroup(), "rule__TimeGem__Group__0");
			builder.put(grammarAccess.getInicioAccess().getNameAssignment_0(), "rule__Inicio__NameAssignment_0");
			builder.put(grammarAccess.getInicioAccess().getVarGlobalesAssignment_2(), "rule__Inicio__VarGlobalesAssignment_2");
			builder.put(grammarAccess.getInicioAccess().getMetodosAssignment_3(), "rule__Inicio__MetodosAssignment_3");
			builder.put(grammarAccess.getInicioAccess().getCondEIteracionesAssignment_4(), "rule__Inicio__CondEIteracionesAssignment_4");
			builder.put(grammarAccess.getInicioAccess().getEjAssignment_5(), "rule__Inicio__EjAssignment_5");
			builder.put(grammarAccess.getVarGoblalAccess().getNameAssignment_1(), "rule__VarGoblal__NameAssignment_1");
			builder.put(grammarAccess.getVarGoblalAccess().getValorAssignment_3(), "rule__VarGoblal__ValorAssignment_3");
			builder.put(grammarAccess.getMetodoAccess().getNameAssignment_1(), "rule__Metodo__NameAssignment_1");
			builder.put(grammarAccess.getMetodoAccess().getParamAssignment_3_0(), "rule__Metodo__ParamAssignment_3_0");
			builder.put(grammarAccess.getMetodoAccess().getParamAssignment_3_1_1(), "rule__Metodo__ParamAssignment_3_1_1");
			builder.put(grammarAccess.getMetodoAccess().getInstruccionesAssignment_5(), "rule__Metodo__InstruccionesAssignment_5");
			builder.put(grammarAccess.getMetodoAccess().getCondEIteracionesAssignment_6(), "rule__Metodo__CondEIteracionesAssignment_6");
			builder.put(grammarAccess.getMetodoAccess().getFuncionesLocalesAssignment_7(), "rule__Metodo__FuncionesLocalesAssignment_7");
			builder.put(grammarAccess.getTipoDoubleAccess().getNameAssignment_1(), "rule__TipoDouble__NameAssignment_1");
			builder.put(grammarAccess.getTipoBooleanAccess().getNameAssignment_1(), "rule__TipoBoolean__NameAssignment_1");
			builder.put(grammarAccess.getTipoStringAccess().getNameAssignment_1(), "rule__TipoString__NameAssignment_1");
			builder.put(grammarAccess.getTipoIntAccess().getNameAssignment_1(), "rule__TipoInt__NameAssignment_1");
			builder.put(grammarAccess.getEjecucionAccess().getInstAssignment(), "rule__Ejecucion__InstAssignment");
			builder.put(grammarAccess.getAsignacionAccess().getNameAssignment_0(), "rule__Asignacion__NameAssignment_0");
			builder.put(grammarAccess.getAsignacionAccess().getValorAssignment_2(), "rule__Asignacion__ValorAssignment_2");
			builder.put(grammarAccess.getLlamadoMetodoAccess().getMetodoAssignment_1(), "rule__LlamadoMetodo__MetodoAssignment_1");
			builder.put(grammarAccess.getLlamadoMetodoAccess().getArgsAssignment_3_0(), "rule__LlamadoMetodo__ArgsAssignment_3_0");
			builder.put(grammarAccess.getLlamadoMetodoAccess().getArgsAssignment_3_1_1(), "rule__LlamadoMetodo__ArgsAssignment_3_1_1");
			builder.put(grammarAccess.getPrintAccess().getEAssignment_2(), "rule__Print__EAssignment_2");
			builder.put(grammarAccess.getConcatenacionAccess().getOpAssignment_1_1(), "rule__Concatenacion__OpAssignment_1_1");
			builder.put(grammarAccess.getConcatenacionAccess().getDerAssignment_1_2(), "rule__Concatenacion__DerAssignment_1_2");
			builder.put(grammarAccess.getOrAccess().getOpAssignment_1_1(), "rule__Or__OpAssignment_1_1");
			builder.put(grammarAccess.getOrAccess().getDerAssignment_1_2(), "rule__Or__DerAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getOpAssignment_1_1(), "rule__And__OpAssignment_1_1");
			builder.put(grammarAccess.getAndAccess().getDerAssignment_1_2(), "rule__And__DerAssignment_1_2");
			builder.put(grammarAccess.getComparacionAccess().getOpAssignment_1_1(), "rule__Comparacion__OpAssignment_1_1");
			builder.put(grammarAccess.getComparacionAccess().getDerAssignment_1_2(), "rule__Comparacion__DerAssignment_1_2");
			builder.put(grammarAccess.getIgualOrDiferenteAccess().getOpAssignment_1_1(), "rule__IgualOrDiferente__OpAssignment_1_1");
			builder.put(grammarAccess.getIgualOrDiferenteAccess().getDerAssignment_1_2(), "rule__IgualOrDiferente__DerAssignment_1_2");
			builder.put(grammarAccess.getModuloAccess().getOpAssignment_1_1(), "rule__Modulo__OpAssignment_1_1");
			builder.put(grammarAccess.getModuloAccess().getDerAssignment_1_2(), "rule__Modulo__DerAssignment_1_2");
			builder.put(grammarAccess.getOperacionAritmeticaAccess().getOpAssignment_1_1(), "rule__OperacionAritmetica__OpAssignment_1_1");
			builder.put(grammarAccess.getOperacionAritmeticaAccess().getDerAssignment_1_2(), "rule__OperacionAritmetica__DerAssignment_1_2");
			builder.put(grammarAccess.getExpSimpAccess().getValorIAssignment_0_1(), "rule__ExpSimp__ValorIAssignment_0_1");
			builder.put(grammarAccess.getExpSimpAccess().getValorBAssignment_1_1(), "rule__ExpSimp__ValorBAssignment_1_1");
			builder.put(grammarAccess.getExpSimpAccess().getValorDAssignment_2_1(), "rule__ExpSimp__ValorDAssignment_2_1");
			builder.put(grammarAccess.getExpSimpAccess().getValorSAssignment_3_1(), "rule__ExpSimp__ValorSAssignment_3_1");
			builder.put(grammarAccess.getExpSimpAccess().getVarAssignment_4_1(), "rule__ExpSimp__VarAssignment_4_1");
			builder.put(grammarAccess.getBloqueInstruccionesAccess().getIntruccionesAssignment_1(), "rule__BloqueInstrucciones__IntruccionesAssignment_1");
			builder.put(grammarAccess.getSoulGemAccess().getCondicionIfAssignment_2(), "rule__SoulGem__CondicionIfAssignment_2");
			builder.put(grammarAccess.getSoulGemAccess().getInstrSOULAssignment_4(), "rule__SoulGem__InstrSOULAssignment_4");
			builder.put(grammarAccess.getMindGemAccess().getCondicionWhileAssignment_1(), "rule__MindGem__CondicionWhileAssignment_1");
			builder.put(grammarAccess.getMindGemAccess().getInstrMINDAssignment_2(), "rule__MindGem__InstrMINDAssignment_2");
			builder.put(grammarAccess.getTimeGemAccess().getCondicionForAssignment_1(), "rule__TimeGem__CondicionForAssignment_1");
			builder.put(grammarAccess.getTimeGemAccess().getFinalForAssignment_3(), "rule__TimeGem__FinalForAssignment_3");
			builder.put(grammarAccess.getTimeGemAccess().getInstrTIMEAssignment_4(), "rule__TimeGem__InstrTIMEAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CompGrammarAccess grammarAccess;

	@Override
	protected InternalCompParser createParser() {
		InternalCompParser result = new InternalCompParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CompGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CompGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
