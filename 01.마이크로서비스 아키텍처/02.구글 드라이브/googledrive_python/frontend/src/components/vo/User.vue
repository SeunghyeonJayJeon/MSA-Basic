<template>
    <div>
        <v-card style="width:300px; margin-left:5%;" outlined>
            
            <v-card-title>
                User
            </v-card-title>
            <v-card-text style = "margin-left:-15px; margin-top:10px;">
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Id" v-model="value.id"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Id :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Password" v-model="value.password"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Password :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Name" v-model="value.name"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Name :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Email" v-model="value.email"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Email :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Address" v-model="value.address"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Address :  
                </div>
                <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
                    <v-text-field label="Phone" v-model="value.phone"/>
                </div>
                <div class="grey--text ml-4" v-else>
                    Phone :  
                </div>
            </v-card-text>
        
        </v-card>
    </div>
</template>

<script>
export default {
    name:"User",
    props: {
        editMode: Boolean,
        value : Object,
    },

    data: () => ({
        date: new Date().toISOString().substr(0, 10),
        address: {}
    }),
    
}
</script>

<style scoped>
    .user-v-card-title {
        display: contents;
    }
    .edit-user-v-text-field {
        margin-top:5px;
        margin-bottom:-20px;
    }
</style>