<template>
  <main class="columns is-gapless is-multiline">
    <div class="column is-one-quarter">
      <BarraLateral />
    </div>
    <div class="column is-three-quarter">
      <FormularioCadastro />
      <!-- Lista de Tarefas ???? -->
    </div>
  </main>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import BarraLateral from './components/BarraLateral.vue'
import FormularioCadastro from './components/FormularioCadastro.vue'

export default defineComponent({
  name: 'App',
  components: {
    BarraLateral,
    FormularioCadastro
  }
});
</script>

<style>

</style>
