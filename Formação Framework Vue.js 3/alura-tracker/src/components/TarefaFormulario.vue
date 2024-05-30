<template>
    <BoxFormulario>
      <div class="columns">
        <div class="column is-7">{{ tarefa.descricao || 'Tarefa sem descrição' }}</div>
        <div class="column">
          <CronometroFormulario :tempoEmSegundos="tarefa.duracaoEmSegundos"/>
        </div>
      </div>
    </BoxFormulario>
  </template>
  
  <script lang="ts">
  import { defineComponent, PropType } from "vue";
  import CronometroFormulario from "./CronometroFormulario.vue";
  import ITarefa from '../interfaces/ITarefa'
  import BoxFormulario from './BoxFormulario.vue'
  
  export default defineComponent({
    name: "TarefaFormulario",
    components: {
      CronometroFormulario,
      BoxFormulario
    },
    props: {
      tarefa: {
        type: Object as PropType<ITarefa>,
        required: true
      }
    }
  });
  </script>