<template>
    <FormularioCadastro @aoSalvarTarefa="salvarTarefa"/>
    <div class="lista">
        <BoxFormulario v-if="semTarefas">
            Você não está muito produtivo hoje <span class="has-text-weight-bold">:(</span>
        </BoxFormulario>
        <TarefaFormulario v-for="(tarefa, index) in tarefas" :tarefa="tarefa" :key="index"/>
    </div>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import FormularioCadastro from "@/components/FormularioCadastro.vue";
import TarefaFormulario from "@/components/TarefaFormulario.vue";
import BoxFormulario from "@/components/BoxFormulario.vue";
import ITarefa from "../interfaces/ITarefa"

export default defineComponent({
  name: "TarefasView",
  components: {
    FormularioCadastro,
    TarefaFormulario,
    BoxFormulario
  },
  data () {
    return {
      tarefas: [] as ITarefa[]
    }
  },
  methods: {
    salvarTarefa (tarefa:ITarefa) : void {
      this.tarefas.push(tarefa)
    }
  },
  computed: {
    semTarefas () :boolean {
      return this.tarefas.length == 0
    }
  }
});
</script>